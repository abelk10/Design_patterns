public abstract class Layer {
    public abstract String doTransform(String message);
    public abstract String doUnpack(String message);
    protected Layer prev;
    protected Layer next;
    protected Layer last;
    protected String header;

    public Layer(Layer prev) {
        this.prev = prev;
        if(prev != null)
            prev.setNext(this);
    }

    public String send(String message){
        String trans = this.doTransform(message);
        if(this.next != null)
            return this.next.send(trans);
        return trans;
    }
    public String unpackReceived(String message){
        if(last != null)
            return last.unpack(message);
        return message;
    }
    public String unpack(String message){
        String trans = this.doUnpack(message);
        if(this.prev != null)
            return this.prev.unpack(trans);
        return trans;
    }

    public void setLast(Layer last) {
        this.last = last;
    }

    public void setPrev(Layer prev) {
        this.prev = prev;
    }

    public void setNext(Layer next) {
        this.next = next;
    }
}
