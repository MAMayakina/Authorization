public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        try {
            System.out.println(Data.dataVerification("Rbbrtrn43578___gleH_","Rbbrtrn43578___","Rbbrtrn43578___"));
        }catch(WrongLoginException e){
            e.getMessage();
        }catch(WrongPasswordException e){
            e.getMessage();
        }
    }
}