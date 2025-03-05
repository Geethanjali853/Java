package FI1;
@FunctionalInterface
interface DaoI1
{
    public abstract void login();
}
class DaoImpl1 {

    public static void main(String[] args) {
        DaoI1 dao = () -> { System.out.println("Login Success");}; // lamda expression ()->{} *no return type *no method name *no access modifiers
        dao.login();
    }
}