class StoB {

public static void main(String[] args) {

    String str = "pradeep";
    String result = "";
    char[] messChar = str.toCharArray();

    for (int i = 0; i < messChar.length; i++) {
        result += Integer.toBinaryString(messChar[i]) + " ";
    }

    System.out.println(result);
}
}