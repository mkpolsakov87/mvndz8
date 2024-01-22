public class Main {
    public static void main(String[] args) {
        FormDate date = new FormDate();
        date.day = 7;
        date.month = 3;
        date.year = 1975;

        Post post = new Post();
        post.surname = "Ivanov";
        post.name = "Ivan";
        post.patronymic = "Ivanovich";
        post.birthday = date;
        post.subscription = true;
        post.passport = "6238 125322";
        post.phone = "+7 912 252-2522";

        System.out.println(post.subscription);
    }
}
