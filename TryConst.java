public class TryConst{
   private String username;
    int age;



    public String getUsername() {
        return username;
        
    }
    public void setUsername(String username) {
        if (!username.isEmpty()){
            this.username = username;
        }
    }

    public TryConst(){}


    public TryConst(String username){
        this.username = username;
    }
    public TryConst (String username, int age) {
        this.username = username;
        this.age = age;
    }
    public static void main(String[] args){
        TryConst tryConst2 = new TryConst(username:"Mae");
        TryConst tryConst2 = new TryConst(username:"Mae", age:18);
    
    }
    
}