package dz_lesson_7;
import java.util.Stack;

public class Dz {

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addVertex("Пенза");
        graph.addVertex("Саратов");
        graph.addVertex("Воронеж");
        graph.addVertex("Тамбов");
        graph.addVertex("Липецк");
        graph.addVertex("Ульяновск");
        graph.addVertex("Вольск");
        graph.addVertex("Сердобск");
        graph.addVertex("Нижний Новгород");
        graph.addVertex("Волгоград");

        graph.addEdge("Пенза","Сердобск");
        graph.addEdge("Сердобск","Вольск");
        graph.addEdge("Вольск","Волгоград");

        graph.addEdge("Пенза","Нижний Новгород");
        graph.addEdge("Нижний Новгород","Ульяновск");
        graph.addEdge("Ульяновск","Саратов");
        graph.addEdge("Саратов","Волгоград");

        graph.addEdge("Пенза","Тамбов");
        graph.addEdge("Тамбов","Липецк");
        graph.addEdge("Липецк","Воронеж");
        graph.addEdge("Воронеж","Волгоград");

       Stack<String> path = graph.findShortPathViaBfs("Нижний Новгород", "Липецк");
        //Stack<String> path = graph.findShortPathViaBfs("Сердобск", "Липецк");
        System.out.println("Самый короткий путь:");
        showShortPath(path);
    }

    private static void showShortPath(Stack<String> path) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;

        while ( !path.isEmpty() ) {
            if (!isFirst) {
                sb.append(" -> ");
            }
            isFirst = false;
            sb.append(path.pop());
        }

        System.out.println(sb);
    }

}