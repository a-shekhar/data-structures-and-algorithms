package trie.using_map;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
     public Map<Character, TrieNode> children;
    public boolean isEnd = false;

    public TrieNode(){
        children = new HashMap<>();
        isEnd = false;
    }

    @Override
    public String toString() {
        return "TrieNode [children=" + children + ", isEnd=" + isEnd + "]";
    }

}
