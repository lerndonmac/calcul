package sample;

public class Model {
    public long calculate(int a,int b, String operator ){
        return switch (operator) {
            case "/"->{if (b==0)yield 0;yield a/b;}
            case "*"->a*b;
            case "-"->a-b;
            case "+"->a+b;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

}
