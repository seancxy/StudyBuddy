/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author larby
 */
public class KanbanBoardDoesNotExistException extends DoesNotExistException {

    public KanbanBoardDoesNotExistException() {
        this("This kanban board does not exist!");
    }

    public KanbanBoardDoesNotExistException(String string) {
        super(string);
    }

}
