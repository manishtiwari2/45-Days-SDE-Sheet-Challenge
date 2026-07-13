class LRUCache {

    static class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    static int capacity;
    static HashMap<Integer, Node> map;
    static Node head, tail;

    LRUCache(int cap) {
        capacity = cap;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    static void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    static void insert(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public static int get(int key) {

        if (!map.containsKey(key))
            return -1;

        Node node = map.get(key);

        remove(node);
        insert(node);

        return node.value;
    }

    public static void put(int key, int value) {

        if (map.containsKey(key)) {

            Node node = map.get(key);
            node.value = value;

            remove(node);
            insert(node);

            return;
        }

        if (map.size() == capacity) {

            Node lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }

        Node node = new Node(key, value);

        insert(node);
        map.put(key, node);
    }
}