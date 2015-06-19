public class MovieStoreTester {
public static void main(String args[]) {
    MovieStore  aStore = new MovieStore();

    Movie aMovie = new Movie("��ëŮ", "����Ƭ");
    aMovie.addActor("�ﻪ");
    aMovie.addActor("�����");
    aMovie.addActor("��ǿ");
    aStore.addMovie(aMovie);

    aMovie = new Movie("����Ů��", "����Ƭ");
    aMovie.addActor("�ﻪ");
    aMovie.addActor("�¸�");
    aStore.addMovie(aMovie);

    aMovie = new Movie("��ɫ���Ӿ�", "����Ƭ");
    aMovie.addActor("ףϣ��");
    aMovie.addActor("���ĸ�");
    aMovie.addActor("��ǿ");
    aStore.addMovie(aMovie);

    aMovie = new Movie("����", "����Ƭ");
    aMovie.addActor("������");
    aMovie.addActor("�Ե�");
    aStore.addMovie(aMovie);

    aMovie = new Movie("�ϸ���", "ս��Ƭ");
    aMovie.addActor("��ǿ");
    aMovie.addActor("�߱���");
    aStore.addMovie(aMovie);

    aMovie = new Movie("��·��ʹ", "ϲ��Ƭ");
    aMovie.addActor("�Ե�");
    aMovie.addActor("���");
    aStore.addMovie(aMovie);

    aMovie = new Movie("������", "���Ƭ");
    aMovie.addActor("����");
    aStore.addMovie(aMovie);

    aMovie = new Movie("�ҵĸ���ĸ��", "����Ƭ");
    aMovie.addActor("������");
    aMovie.addActor("�����");
    aStore.addMovie(aMovie);

    aMovie = new Movie("�����", "����Ƭ");
    aMovie.addActor("����");
    aMovie.addActor("�w��");
    aStore.addMovie(aMovie);

    System.out.println("Here are the movies in: " + aStore);
    aStore.listMovies();
    System.out.println();

    //����ɾ��
    System.out.println("ɾ����ëŮ");
    aStore.removeMovie("��ëŮ");
    System.out.println("ɾ����մ��˾");
    aStore.removeMovie("��մ��˾");

    //�����������
    System.out.println("\n����Ƭ��");
    aStore.listMoviesOfType("����Ƭ");
    System.out.println("\n����Ƭ��");
    aStore.listMoviesOfType("����Ƭ");

    System.out.println("\n��ǿ�ĵ�Ӱ::");
    aStore.listMoviesWithActor("��ǿ");
    System.out.println("\n�Ե��ĵ�Ӱ:");
    aStore.listMoviesWithActor("�Ե�");
}
}
