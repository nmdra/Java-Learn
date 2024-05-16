package OnlineTest.OnlineTest2.VersionE;

class student {
    String id;
    String name;
    public student(String id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }

    void display() {
        try{
            if(!id.substring(0,2).equals("IT") || id.length() != 10 || !checkNum(id)){
                throw new InvalidITNumberException("invalid");
            }
            System.out.println(id);
            System.out.println(name);
        } catch (InvalidITNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    void displayRegex(){
        try{
            if(!id.matches("IT\\d{8}")){
                throw new InvalidITNumberException("invalid");
            }

            System.out.println(id);
            System.out.println(name);
        } catch (InvalidITNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    boolean checkNum(String id){
       try{
           long num = Integer.parseInt(id.substring(2,10));
           return true;

       }catch (NumberFormatException e){
           return false;
       }
    }

}

