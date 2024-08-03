// SPDX-License-Identifier: GPL-3.0
pragma solidity ^0.8.19;

contract Blog {
    struct Post {
        uint256 id;
        address author;
        string title;
        string content;
        uint256 timestamp;
    }

    mapping(uint256 => Post) private posts;
    uint256 public postCount;

    function createPost(string memory _title, string memory _content) public {
        postCount++;
        posts[postCount] = Post(postCount, msg.sender, _title, _content, block.timestamp);
    }

    function getPost(uint256 _postId) public view returns (Post memory) {
        require(_postId > 0 && _postId <= postCount, "Invalid post ID");
        return posts[_postId];
    }

    function getAllPost() public view returns (Post[] memory) {
        Post[] memory allPosts = new Post[](postCount);
        for (uint256 i = 1; i <= postCount; i++) {
            Post storage post = posts[i];
            allPosts[i - 1] = post;
        }
        return allPosts;
    }
}