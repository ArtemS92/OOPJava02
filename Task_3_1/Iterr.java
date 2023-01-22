package Task_3_1;

public interface Iterr {
    void ViewForward(Human n, String space);

    void ViewReverse(Human n, StringBuilder sb, String str) ;
}
class It implements Iterr{
    @Override
    public void ViewForward(Human n, String space) {
        if (n != null) {
            System.out.printf("%s%s %s %s\n", space, n.id, n.fn, n.ln);

            if (n.dad != null) {
                ViewForward(n.dad, space + " ");
            }
            if (n.mom != null) {
                ViewForward(n.mom, space + " ");
            }
        }
    }

    @Override
    public void ViewReverse(Human n, StringBuilder sb, String str) {
        if (n != null) {
            sb.append(String.format("%sid:%d fn:%s ln:%s\n", str, n.id, n.fn, n.ln));
            if (!n.childs.isEmpty()) {
                str += ' ';
                for (Human child : n.childs) {
                    ViewReverse(child, sb, str);
                }
            }
        }
    }

}
