package org.web3j.model;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/main/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.11.3.
 */
@SuppressWarnings("rawtypes")
public class Blog extends Contract {
    public static final String BINARY = "6080604052348015600e575f80fd5b506109538061001c5f395ff3fe608060405234801561000f575f80fd5b506004361061004a575f3560e01c806317906c2e1461004e578063392338f51461006a57806340731c241461007f578063da7d9d101461009f575b5f80fd5b61005760015481565b6040519081526020015b60405180910390f35b61007d610078366004610605565b6100b4565b005b61009261008d36600461066a565b610163565b604051610061919061070f565b6100a7610326565b6040516100619190610728565b60018054905f6100c38361079f565b90915550506040805160a08101825260018054808352336020808501918252848601888152606086018890524260808701525f938452908390529490912083518155905191810180546001600160a01b0319166001600160a01b03909316929092179091559151909190600282019061013c9082610835565b50606082015160038201906101519082610835565b50608082015181600401559050505050565b61016b610531565b5f8211801561017c57506001548211155b6101be5760405162461bcd60e51b815260206004820152600f60248201526e125b9d985b1a59081c1bdcdd081251608a1b604482015260640160405180910390fd5b5f8281526020818152604091829020825160a0810184528154815260018201546001600160a01b0316928101929092526002810180549293919291840191610205906107b7565b80601f0160208091040260200160405190810160405280929190818152602001828054610231906107b7565b801561027c5780601f106102535761010080835404028352916020019161027c565b820191905f5260205f20905b81548152906001019060200180831161025f57829003601f168201915b50505050508152602001600382018054610295906107b7565b80601f01602080910402602001604051908101604052809291908181526020018280546102c1906107b7565b801561030c5780601f106102e35761010080835404028352916020019161030c565b820191905f5260205f20905b8154815290600101906020018083116102ef57829003601f168201915b505050505081526020016004820154815250509050919050565b60605f60015467ffffffffffffffff81111561034457610344610566565b60405190808252806020026020018201604052801561037d57816020015b61036a610531565b8152602001906001900390816103625790505b50905060015b600154811161052b575f8181526020818152604091829020825160a0810184528154815260018201546001600160a01b0316928101929092526002810180549193849290840191906103d4906107b7565b80601f0160208091040260200160405190810160405280929190818152602001828054610400906107b7565b801561044b5780601f106104225761010080835404028352916020019161044b565b820191905f5260205f20905b81548152906001019060200180831161042e57829003601f168201915b50505050508152602001600382018054610464906107b7565b80601f0160208091040260200160405190810160405280929190818152602001828054610490906107b7565b80156104db5780601f106104b2576101008083540402835291602001916104db565b820191905f5260205f20905b8154815290600101906020018083116104be57829003601f168201915b50505050508152602001600482015481525050836001846104fc91906108f0565b8151811061050c5761050c610909565b60200260200101819052505080806105239061079f565b915050610383565b50919050565b6040518060a001604052805f81526020015f6001600160a01b0316815260200160608152602001606081526020015f81525090565b634e487b7160e01b5f52604160045260245ffd5b5f82601f830112610589575f80fd5b813567ffffffffffffffff8111156105a3576105a3610566565b604051601f8201601f19908116603f0116810167ffffffffffffffff811182821017156105d2576105d2610566565b6040528181528382016020018510156105e9575f80fd5b816020850160208301375f918101602001919091529392505050565b5f8060408385031215610616575f80fd5b823567ffffffffffffffff81111561062c575f80fd5b6106388582860161057a565b925050602083013567ffffffffffffffff811115610654575f80fd5b6106608582860161057a565b9150509250929050565b5f6020828403121561067a575f80fd5b5035919050565b5f81518084528060208401602086015e5f602082860101526020601f19601f83011685010191505092915050565b8051825260018060a01b0360208201511660208301525f604082015160a060408501526106df60a0850182610681565b9050606083015184820360608601526106f88282610681565b915050608083015160808501528091505092915050565b602081525f61072160208301846106af565b9392505050565b5f602082016020835280845180835260408501915060408160051b8601019250602086015f5b8281101561077f57603f1987860301845261076a8583516106af565b9450602093840193919091019060010161074e565b50929695505050505050565b634e487b7160e01b5f52601160045260245ffd5b5f600182016107b0576107b061078b565b5060010190565b600181811c908216806107cb57607f821691505b60208210810361052b57634e487b7160e01b5f52602260045260245ffd5b601f82111561083057805f5260205f20601f840160051c8101602085101561080e5750805b601f840160051c820191505b8181101561082d575f815560010161081a565b50505b505050565b815167ffffffffffffffff81111561084f5761084f610566565b6108638161085d84546107b7565b846107e9565b6020601f821160018114610895575f831561087e5750848201515b5f19600385901b1c1916600184901b17845561082d565b5f84815260208120601f198516915b828110156108c457878501518255602094850194600190920191016108a4565b50848210156108e157868401515f19600387901b60f8161c191681555b50505050600190811b01905550565b818103818111156109035761090361078b565b92915050565b634e487b7160e01b5f52603260045260245ffdfea264697066735822122078eeffc390e0ed9ff8441722ec47332fd263ea00929a6d26df1f0fbac9866e4964736f6c634300081a0033";

    private static String librariesLinkedBinary;

    public static final String FUNC_CREATEPOST = "createPost";

    public static final String FUNC_GETALLPOST = "getAllPost";

    public static final String FUNC_GETPOST = "getPost";

    public static final String FUNC_POSTCOUNT = "postCount";

    @Deprecated
    protected Blog(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Blog(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Blog(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Blog(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> createPost(String _title, String _content) {
        final Function function = new Function(
                FUNC_CREATEPOST, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_title), 
                new org.web3j.abi.datatypes.Utf8String(_content)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<List> getAllPost() {
        final Function function = new Function(FUNC_GETALLPOST, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Post>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<Post> getPost(BigInteger _postId) {
        final Function function = new Function(FUNC_GETPOST, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_postId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Post>() {}));
        return executeRemoteCallSingleValueReturn(function, Post.class);
    }

    public RemoteFunctionCall<BigInteger> postCount() {
        final Function function = new Function(FUNC_POSTCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static Blog load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Blog(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Blog load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Blog(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Blog load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Blog(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Blog load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Blog(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Blog> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Blog.class, web3j, credentials, contractGasProvider, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<Blog> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Blog.class, web3j, credentials, gasPrice, gasLimit, getDeploymentBinary(), "");
    }

    public static RemoteCall<Blog> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Blog.class, web3j, transactionManager, contractGasProvider, getDeploymentBinary(), "");
    }

    @Deprecated
    public static RemoteCall<Blog> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Blog.class, web3j, transactionManager, gasPrice, gasLimit, getDeploymentBinary(), "");
    }

//    public static void linkLibraries(List<Contract.LinkReference> references) {
//        librariesLinkedBinary = linkBinaryWithReferences(BINARY, references);
//    }

    private static String getDeploymentBinary() {
        if (librariesLinkedBinary != null) {
            return librariesLinkedBinary;
        } else {
            return BINARY;
        }
    }

    public static class Post extends DynamicStruct {
        public BigInteger id;

        public String author;

        public String title;

        public String content;

        public BigInteger timestamp;

        public Post(BigInteger id, String author, String title, String content, BigInteger timestamp) {
            super(new org.web3j.abi.datatypes.generated.Uint256(id), 
                    new org.web3j.abi.datatypes.Address(160, author), 
                    new org.web3j.abi.datatypes.Utf8String(title), 
                    new org.web3j.abi.datatypes.Utf8String(content), 
                    new org.web3j.abi.datatypes.generated.Uint256(timestamp));
            this.id = id;
            this.author = author;
            this.title = title;
            this.content = content;
            this.timestamp = timestamp;
        }

        public Post(Uint256 id, Address author, Utf8String title, Utf8String content, Uint256 timestamp) {
            super(id, author, title, content, timestamp);
            this.id = id.getValue();
            this.author = author.getValue();
            this.title = title.getValue();
            this.content = content.getValue();
            this.timestamp = timestamp.getValue();
        }
    }
}
