public class Test {

    public static void main(String[] args) {
        CustomHashSet customHashSet=new CustomHashSet();

        customHashSet.add(122);
        customHashSet.add(13);
        customHashSet.add(130);
        customHashSet.add(192);
        customHashSet.add(59);

        System.out.println(customHashSet);

        System.out.println(customHashSet.delete(122));
        System.out.println(customHashSet);
    }
}
