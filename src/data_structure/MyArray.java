package data_structure;

public class MyArray {
    private long[] array;
    private int length = 0;

    //构造，确定数组长度
    public MyArray(int size) {
        array = new long[size];
    }

    //插入，增加数组长度
    public void insert(long item) {
        array[length++] = item;
    }

    //查找，查看是否存在
    public boolean find(long item) {
        for (int i = 0; i < length; i++) {
            if (array[i] == item) {
                return true;
            }
        }
        return false;
    }

    //查找返回下标或-1
    public int indexOf(long item) {
        for (int i = 0; i < length; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    //删除元素并移动数组
    public boolean delete(long item) {
        int i = 0;
        for (i = 0; i < length; i++) {
            if (item == array[i]) {
                break;
            }
        }
        if (i == length)
            return false;
        for (int j = i; j < length - 1; j++) {
            array[j] = array[j + 1];
        }
        length--;
        return true;
    }

    //打印数组
    public void show() {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            if (i == length - 1)
                System.out.print(array[i]);
            else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(10);
        System.out.println(myArray.length);
        myArray.insert(6);
        myArray.insert(7);
        myArray.insert(8);
        myArray.show();
        System.out.println(myArray.length);
        if (myArray.find(7) && myArray.indexOf(7) != -1) {
            System.out.println("找到了");
        } else {
            System.out.println("没找到");
        }
        if (myArray.delete(7)) {
            System.out.println("删除了");
            myArray.show();
        } else {
            System.out.println("没找到");
            myArray.show();
        }
    }
}