# legendary-adventure

## Time Greeting - Android App

Um aplicativo Android com cores pasteis que mostra uma mensagem diferente dependendo da hora do dia.

### Funcionalidades

- **Interface com cores pasteis**: O aplicativo usa uma paleta de cores suaves e agradáveis
- **Botão interativo**: Um botão central na tela que pode ser clicado
- **Mensagem baseada na hora**: Ao clicar no botão, aparece um pop-up com uma mensagem diferente dependendo da hora do dia:
  - 6h - 11h59: "Bom dia! ☀️"
  - 12h - 17h59: "Boa tarde! 🌤️"
  - 18h - 23h59: "Boa noite! 🌙"
  - 0h - 5h59: "Boa madrugada! ⭐"

### Estrutura do Projeto

```
.
├── app/
│   ├── build.gradle                           # Configuração do módulo do app
│   ├── proguard-rules.pro                     # Regras do ProGuard
│   └── src/main/
│       ├── AndroidManifest.xml                # Manifesto do Android
│       ├── java/com/example/timegreeting/
│       │   └── MainActivity.kt                # Activity principal com lógica
│       └── res/
│           ├── drawable/
│           │   └── ic_launcher_foreground.xml # Ícone do app
│           ├── layout/
│           │   └── activity_main.xml          # Layout da tela principal
│           ├── mipmap-anydpi-v26/
│           │   ├── ic_launcher.xml            # Ícone adaptável
│           │   └── ic_launcher_round.xml      # Ícone redondo adaptável
│           └── values/
│               ├── colors.xml                 # Cores pasteis
│               ├── strings.xml                # Strings do app
│               └── themes.xml                 # Tema com cores pasteis
├── build.gradle                               # Configuração do projeto
├── settings.gradle                            # Configurações do Gradle
└── gradle/wrapper/                            # Gradle wrapper
    └── gradle-wrapper.properties
```

### Como Compilar

Este é um projeto Android padrão. Para compilar:

1. Abra o projeto no Android Studio
2. Sincronize as dependências do Gradle
3. Execute o app em um emulador ou dispositivo físico

### Tecnologias Usadas

- **Kotlin**: Linguagem de programação principal
- **Android SDK**: Plataforma Android (API 21+)
- **Material Design Components**: Para componentes de UI modernos
- **ConstraintLayout**: Para layouts flexíveis e responsivos
