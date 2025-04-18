package com.college.client;

import com.college.annotations.Inject;
import com.college.injector.DependencyInjector;
import com.college.services.EmailService;

import java.io.FileWriter;

public class App {

    @Inject
    private EmailService emailService;

    public static void main(String[] args) {
        App app = new App();
        try {
            DependencyInjector.injectDependencies(app);
            app.emailService.sendEmail("Dependency Injection Successful!");

            String htmlContent = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset='UTF-8'>
                    <title>Custom Annotations - Dependency Injection</title>
                    <link rel='stylesheet' href='style.css'>
                </head>
                <body>
                    <div class='main-container'>
                        <header>
                            <h1>🔧 Custom Annotation Framework</h1>
                            <p>Simple and Lightweight Java-based Dependency Injection</p>
                        </header>
                        <section class='summary'>
                            <h2>✅ Injection Successful</h2>
                            <p>The <code>EmailService</code> was successfully injected using the <code>@Inject</code> annotation via reflection.</p>
                        </section>
                        <section class='details'>
                            <h3>How it Works</h3>
                            <ul>
                                <li><strong>@Inject</strong> marks a field to be injected</li>
                                <li><strong>DependencyInjector</strong> scans and assigns dependencies using reflection</li>
                                <li><strong>EmailService</strong> simulates a real-world service</li>
                                <li><strong>App</strong> is your client-side runner</li>
                            </ul>
                        </section>
                        
                    </div>
                </body>
                </html>
                """;

            try (FileWriter writer = new FileWriter("web/index.html")) {
                writer.write(htmlContent);
                System.out.println("✅ HTML file generated at: web/index.html");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
