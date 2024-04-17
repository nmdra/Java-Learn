package Test.VersionE;

class student {
    String id;
    String name;
    public student(String id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }


    void desplay()
    {
        try {


            if (id.length()!=10||(id.substring(0,2).equals("IT"))==false && (id.substring(0,2).equals("it"))==false) {

                throw  new InvalidITNumberException("invalis number");
            }
            try {
                long num =Integer.parseInt(id.substring(2,10));
            }

            catch (NumberFormatException e) {
                throw  new InvalidITNumberException("invalis It number");
            }

            System.out.println(id);
            System.out.println(name);
        }

        catch (InvalidITNumberException  e) {
            System.out.println(e.getMessage());

        }
    }


}

