class Main {
    public static int rotatedDigits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            String s = "" + i;

            if (s.contains("3") || s.contains("4") || s.contains("7"))
                continue;

            if (s.contains("2") || s.contains("5") ||
                s.contains("6") || s.contains("9")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(rotatedDigits(n));
    }
}
