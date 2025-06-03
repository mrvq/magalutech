package com.tech.magalutech.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tech.magalutech.service.NotificationService;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class MagaluTaskScheduler {

    private static final Logger logger = LoggerFactory.getLogger(MagaluTaskScheduler.class);

    /**
     * Método agendado para executar tarefas periódicas.
     * Neste exemplo, o método é executado a cada 1 minuto.
     */

    private final NotificationService notificationService;

    public MagaluTaskScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void runTasks() {
        // TODO: Implementar a lógica de agendamento de tarefas
        var dateTime = LocalDateTime.now();
        logger.info("Executando tarefas agendadas {}", dateTime);

        // Aqui você pode chamar o serviço de notificação para verificar e enviar
        // notificações
        notificationService.checkAndSend(dateTime);
    }

}
