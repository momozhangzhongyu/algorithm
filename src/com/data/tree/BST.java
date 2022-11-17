package com.data.tree;

import com.data.queue.LinkQueue;
import com.data.queue.Queue;

import java.util.Stack;

public class BST<E extends Comparable<E>> {

    private class Node{
        public E e;
        public Node left,right;
        public Node(E e, Node left, Node right){
            this.e = e;
            this.left = left;
            this.right = right;
        }

        public Node(E e){
            this(e, null, null);
        }

        public Node(){
            this(null, null, null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node root;
    private int size;

    public BST(){
        this.root = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void add(E e){
        root = add(root, e);
    }

    private Node add(Node node, E e) {
        if(node == null){
            size++;
            return new Node(e);
        }
        if(e.compareTo(node.e)<0){
            node.left = add(node.left, e);
        }else if(e.compareTo(node.e)>0){
            node.right = add(node.right, e);
        }
        return node;
    }

    public boolean contain(E e){
        return contain(root, e);
    }

    private boolean contain(Node node, E e) {
        if(node == null)
            return false;
        if (node.e.equals(e)){
            return true;
        }else if(e.compareTo(node.e) < 0){
            return contain(node.left, e);
        }else {
            return contain(node.right, e);
        }
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node) {
        if(node==null)
            return;
        System.out.println(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void preOrderNR(){
        if(root==null)
            return;
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);
            if(cur.right != null)
                stack.push(cur.right);
            if(cur.left != null)
                stack.push(cur.left);


        }
    }

    public void preOrderZr(){
        if(root == null)
            return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);

            if(cur.right != null)
                stack.push(cur.right);
            if(cur.left != null)
                stack.push(cur.left);
        }
    }

    private void preOrderNR(Node node) {
        if(node==null)
            return;
        Stack<Node> stack = new Stack<Node>();
        stack.push(node);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);
            if(cur.left != null)
                stack.push(cur.left);

            if(cur.right != null)
                stack.push(cur.right);
        }
    }

    public void levelOrder(){
        if(root == null)
            return;
        Queue<Node> queue = new LinkQueue<>();
        queue.enqueue(root);
        while (!queue.isEmpty()){
            Node cur = queue.dequeue();
            System.out.println(cur);
            if(cur.left != null)
                queue.enqueue(cur.left);
            if(cur.right != null)
                queue.enqueue(cur.right);
        }
    }

    public E minimum(){
        if(size == 0)
            throw new IllegalArgumentException("bst is empty!");
        return minimum(root).e;
    }

    private Node minimum(Node node){
        if(node.left == null)
            return node;
        return minimum(node.left);
    }

    public E maximum(){
        if(size == 0)
            throw new IllegalArgumentException("bst is empty!");
        return maximum(root).e;
    }

    private Node maximum(Node node){
        if(node.right == null)
            return node;
        return maximum(node.right);
    }


    public E removeMin(){
        E e = minimum();
        root = removeMin(root);
        return e;
    }

    private Node removeMin(Node node) {
        if(node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }



//    /**
//     * bak20221116
//     * @param e
//     */
//    public void add(E e){
//        if(this.root == null){
//            this.root = new Node(e);
//            size++;
//        }else{
//            add(this.root, e);
//        }
//    }
//
//    /**
//     * bak 20221116
//     * @param node
//     * @param e
//     */
//    private void add(Node node, E e) {
//        if(node.e.equals(e)){
//            return;
//        }else if(e.compareTo(node.e) < 0 && node.left == null){
//            node.left = new Node(e);
//            size++;
//            return;
//        }else if(e.compareTo(node.e) > 0 && node.right == null){
//            node.right = new Node(e);
//            size++;
//            return;
//        }else if(e.compareTo(node.e) < 0){
//            add(node.left, e);
//        }else {
//            add(node.right, e);
//        }
//    }

    public static int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        BST<String> bst = new BST<>();
        for(String word: words){
            StringBuilder res = new StringBuilder();
            for(int i = 0 ; i < word.length() ; i ++)
                res.append(codes[word.charAt(i) - 'a']);
            bst.add(res.toString());
        }

        return bst.size();
    }
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node==null)
            return;
        inOrder(node.left);
        System.out.println(node);
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node) {
        if(node==null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        generateString(root, 0, res);
        return res.toString();
    }

    private void generateString(Node node, int depth, StringBuilder res){
        if(node == null){
            res.append(generateDepthString(depth) + "null\n");
            return;
        }
        res.append(generateDepthString(depth) + node.e + "\n");
        generateString(node.left, depth+1, res);
        generateString(node.right, depth+1, res);
    }

    private String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for(int i=0; i<depth; i++){
            res.append("--");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        BST<Integer> bst = new BST<>();
        Integer[] words = new Integer[]{1,12,13,21,33,42,24,34,53,25,0};
        for(Integer word: words){
            bst.add(word);
        }
        System.out.println("-----------preOrder---------------");
        bst.preOrder();
        System.out.println("-----------preOrder---------------");
        System.out.println("-----------NR---------------");
        bst.preOrderNR();
        System.out.println("-----------NR---------------");
        System.out.println("-----------levelOrder---------------");
        bst.levelOrder();
        System.out.println("-----------levelOrder---------------");
        bst.inOrder();
        bst.postOrder();
        System.out.println(bst);
    }

}
