package trie.using_map;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            Character ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null){
                node = new TrieNode();
                curr.children.put(ch, node);
            }

            curr = node;
        }

        curr.isEnd = true; // at the last it needs to be ended
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            Character ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null){
                return false;
            }
            curr = node;
        }
        return  curr.isEnd == true;
    }

    // Check if a prefix exists in the Trie
    public boolean isPrefix(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            Character ch = word.charAt(i);
            TrieNode node = curr.children.get(ch);
            if(node == null){
                return false;
            }
            curr = node;
        }
        return  true;
    }

    public void print(){
        TrieNode curr = root;
        System.out.println(curr);
    }

    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("Aditya");
        newTrie.insert("Raj");
        newTrie.print();
        System.out.println(newTrie.isPrefix("Adi"));
        System.out.println(newTrie.search("Adity"));
    }
}
