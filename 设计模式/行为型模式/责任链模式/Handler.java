package 设计模式.行为型模式.责任链模式;

/**
 * 抽象处理者角色
 */
public abstract class Handler {

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    //处理请求的方法
    abstract void handlerRequest(String request);

}
