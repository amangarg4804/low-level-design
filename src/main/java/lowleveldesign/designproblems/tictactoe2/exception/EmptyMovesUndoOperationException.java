package lowleveldesign.designproblems.tictactoe2.exception;

public class EmptyMovesUndoOperationException extends RuntimeException{
    public EmptyMovesUndoOperationException(String message) {
        super(message);
    }

}
