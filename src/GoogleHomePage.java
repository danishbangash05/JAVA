public class GoogleHomePage {
    public static void main(String[] args) {
        OpenHomePage();
        GoogleHomePage GoogleHome= new GoogleHomePage();
        GoogleHome.SearchForSomething();
        GoogleHome.WebPage();

    }
    public static void OpenHomePage(){
        boolean DoesHomePageOpens = false;
        //when you are click on www.google.com the homepage will appear
        if (DoesHomePageOpens){
            System.out.println("if you click this link www.google.com");
            System.out.println("Google HomePage should open");
        }
        else
            if (!DoesHomePageOpens){
                System.out.println("if you click this link www.google.com");
                System.out.println("Google HomePage won't appear");
            }
    }
    public void WebPage(){
        System.out.println("If you Click on the link www.google.com, WebPage will open");
        System.out.println("Webpage Open");
    }
    public void SearchForSomething(){
        System.out.println("If you search Something you should get your particular search result");
    }
}

