package com.example.examenfinal.services;

import com.example.examenfinal.models.Tarea;

import java.util.List;

public interface TareaService {
    public List<Tarea> listarTareas();
    public Tarea buscarPorId(Long id);
    public Tarea crearTarea(Tarea tarea);
    public Tarea actualizarTarea(Long id, Tarea tarea);
    public void eliminarTarea(Long id);
}
