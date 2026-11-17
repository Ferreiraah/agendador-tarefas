package com.javaproject.agendadortarefas.business
;

import com.javaproject.agendadortarefas.infrastructure.repository.TarefasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private TarefasRepository tarefaRepository;
}
