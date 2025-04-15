package com.stackroute.keepnote.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


import com.stackroute.keepnote.model.Note;

/*
 * This class contains the code for data storage interactions and methods
 * of this class will be used by other parts of the applications such
 * as Controllers and Test Cases
 * */

public class NoteRepository {

    /* Declare a variable called "list" to store all the notes. */
    private List<Note> list;

    public NoteRepository() {

        /* Initialize the variable using proper data type */
        list = new ArrayList<>();
    }

    /* This method should return all the notes in the list */

    public List<Note> getList() {
        return this.list;
    }

    /* This method should set the list variable with new list of notes */

    public void setList(List<Note> list) {
        this.list = list;
    }

    /*
     * This method should Note object as argument and add the new note object into
     * list
     */

    public void addNote(Note note) {
        getList().add(note);
    }

    /* This method should deleted a specified note from the list */

    public boolean deleteNote(int noteId) {
        /* Use list iterator to find matching note id and remove it from the list */
        ListIterator<Note> iterator = this.list.listIterator();
        Boolean isRemoved = Boolean.FALSE;
        while (iterator.hasNext()) {
            if (noteId == iterator.next().getNoteId()) {
                iterator.remove();
                isRemoved = Boolean.TRUE;
            }
        }
        return isRemoved;
    }

    /* This method should return the list of notes */

    public List<Note> getAllNotes() {
        return this.getList();
    }

    /*
     * This method should check if the matching note id present in the list or not.
     * Return true if note id exists in the list or return false if note id does not
     * exists in the list
     */

    public boolean exists(int noteId) {

        // Java 7 Approach
       /* ListIterator<Note> iterator = this.getAllNotes().listIterator();
        while (iterator.hasNext()) {
            if (noteId == iterator.next().getNoteId()) {
                return true;
            }
        }
        return false;*/

        // Java 8 Approach
        return this.getAllNotes().stream().filter(note -> note.getNoteId() == noteId).findAny().isPresent();
    }

    // updating the note if already present in the notes

    public boolean updateNote(Note incomingNote) {
       Boolean isUpdated = Boolean.FALSE;
        if (this.exists(incomingNote.getNoteId())) {
            for (Note note : this.getAllNotes()) {
                if (note.getNoteId() == incomingNote.getNoteId()) {
                    note.setNoteTitle(incomingNote.getNoteTitle());
                    note.setNoteContent(incomingNote.getNoteContent());
                    note.setNoteStatus(incomingNote.getNoteStatus());
                    note.setCreatedAt(LocalDateTime.now());
                    isUpdated = Boolean.TRUE;
                }
            }

        } else isUpdated = Boolean.FALSE;

        return isUpdated;
    }
}