package 设计模式.行为型模式.责任链模式;

/**
 * 具体处理者角色2
 */
public class ConcreteHandler2 extends Handler{
    @Override
    void handlerRequest(String request) {
        if(request.equals("two")){
            System.out.println("具体处理者2负责处理请求...");
        }else{
            if(super.getNext() != null){
                super.getNext().handlerRequest(request);
            }else{
                System.out.println("没有人处理请求...");
            }
        }
    }
}
