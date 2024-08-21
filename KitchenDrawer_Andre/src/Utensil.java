public abstract class Utensil{
    private boolean clean;
    private boolean polished;
    private String useCase;

    public Utensil(String useCase) {
        this.useCase = useCase;
        this.clean = false;
        this.polished = false;
    }
    public void polish(){
        this.polished = true;
    }
    public void clean(){
        this.clean = true;

    }
    public boolean isClean(){
        return clean;
    }
    public boolean isPolished(){
        return polished;

    }
    public boolean forFineDining(){
        if(useCase.equalsIgnoreCase("Fine Dining")){
            return true;
        }else{
            return false;
        }

    }
    public boolean forCooking(){
        if(useCase.equalsIgnoreCase("Cooking")){
            return true;
        }else{
            return false;
        }

    }
    public void use(){
        this.clean = false;
        this.polished = false;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    @Override
    public String toString() {
        return (clean ? " Yes" : " No")
                + (polished ? " and it is polished" : " and it is not polished")
                +  ". \nWhat is it used for: " + useCase + "\n";

    }
}