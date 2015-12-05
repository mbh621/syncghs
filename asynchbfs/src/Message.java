/**
 * Synch GHS Algorithm
 * Group Members:
 * Maxwell Hall
 * Prashant Prakash
 * Shashank Adidamu
 */

public class Message {
    Node source;
    MessageType type;
    Object data;
    int round;
    
    public Message(Node source, MessageType type) {
        this.source = source;
        this.type = type;
        this.data = null;
    }

    public Message(Node source, MessageType type, Object data) {
        this.source = source;
        this.type = type;
        this.data = data;
    }

    enum MessageType {
        RoundTermination,
        AlgoTerminationRequest,
        AlgoTermination,
        DistanceUpdate
    }
}
