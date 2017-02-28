// https://www.hackerrank.com/challenges/java-static-initializer-block
static Scanner sc = new Scanner(System.in);
static int B = sc.nextInt();
static int H = sc.nextInt();
static boolean flag = true;

static {
    if (B <= 0 || H <= 0) {
        flag = false;
    }
    
    if (!flag) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}
