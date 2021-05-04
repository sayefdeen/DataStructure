public class Testing {
    public static void main(String[] args) {
        String[] name = {"1 99","2","1 100"};
        for (int i = 0; i <name.length ; i++) {
            String[] cases = name[i].split(" ");
            String type = cases[0];
            int number = 0;
            if (cases.length == 2){
                number = Integer.parseInt(cases[1]);
            }
        }

    }
}
