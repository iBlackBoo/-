package 设计模式.结构型模式.组合模式.透明式;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件
 */
public class Composite implements Component {

    private List<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object o:children) {
            ((Component)o).operation();
        }
    }
}
