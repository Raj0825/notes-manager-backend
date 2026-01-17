package com.notesmanager.controller;

import com.notesmanager.dto.NoteRequest;
import com.notesmanager.entity.Note;
import com.notesmanager.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "*")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public Note create(@RequestBody NoteRequest request) {
        Note note = new Note();
        note.setTitle(request.getTitle());
        note.setContent(request.getContent());
        return noteService.createNote(note);

    }

    @GetMapping
    public List<Note> getAll() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    public Note getById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        noteService.deleteNote(id);
    }

    @PutMapping("/{id}")
    public Note update(@PathVariable Long id, @RequestBody NoteRequest request) {
        Note note = noteService.getNoteById(id);
        note.setTitle(request.getTitle());
        note.setContent(request.getContent());
        return noteService.createNote(note);
    }

}
