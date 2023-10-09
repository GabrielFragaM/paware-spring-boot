package com.paware.service.project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    public List<Project> getProjects() {

        return List.of(new Project(
                1L,
                "Auto Checklist",
                "Sistema de inspeção Auto Checklist",
                ProjectStatus.ABERTO
        ));
    }
}
