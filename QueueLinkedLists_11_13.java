public class QueueLinkedLists_11_13 {
    Node_11_13 front;
    Node_11_13 rear;
    int size;
    int max;

    QueueLinkedLists_11_13(int max){
        this.max = max;
        this.rear = null;
        this.front = null;
        this.size = 0;
    }

     boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    public void enqueue(Kendaraan_11_13 k){
        if(isFull()){
            System.out.println("Antrian Penuh!!");
            return;
        }
        Node_11_13 newNode = new Node_11_13(k, null);
        if(isEmpty()){
            front = rear = newNode;
        } else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Kendaraan masuk ke dalam antrian");
    }

    public Kendaraan_11_13 dequeue(){
        if(isEmpty()){
            System.out.println("Antrian kosong tidak dapat melayani!");
            return null;
        }
        Kendaraan_11_13 temp = front.kendaraan;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return temp;
    }

    public void tampilkanAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("--- Antrian Kendaraan ---");
        Node_11_13 temp = front;
        while (temp != null) {
            for (int i = 0; i < size - 1; i++) {
            temp.kendaraan.tampilkanInformasi();
            temp = temp.next;
            i++;
            }
        }
    }

    int jumlahAntrian(){
        return size;
    }

    
}
