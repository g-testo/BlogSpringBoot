package com.gt.blog.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.web3j.model.Blog;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;
import org.web3j.crypto.Credentials;

import java.math.BigInteger;
import java.util.List;

@Service
public class PostBlockchainService {

    private final Blog blog;

    public PostBlockchainService(@Value("${ethereum.network.url}") String networkUrl,
                       @Value("${contract.address}") String contractAddress,
                       @Value("${wallet.private.key}") String privateKey) {
        Web3j web3j = Web3j.build(new HttpService(networkUrl));
        Credentials credentials = Credentials.create(privateKey);
        TransactionManager txManager = new RawTransactionManager(web3j, credentials);
        ContractGasProvider gasProvider = new DefaultGasProvider();

        this.blog = Blog.load(contractAddress, web3j, txManager, gasProvider);
    }

    public void createPost(String title, String content) throws Exception {
        blog.createPost(title, content).send();
    }

    public Blog.Post getPost(BigInteger postId) throws Exception {
        return blog.getPost(postId).send();
    }

    public List<Blog.Post> getAllPosts() throws Exception {
        return blog.getAllPost().send();
    }

}
