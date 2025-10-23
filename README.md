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

## Pré-requisitos

Antes de começar, certifique-se de ter instalado:

- **Java Development Kit (JDK) 8 ou superior**
  - Baixe em: https://www.oracle.com/java/technologies/downloads/
  - Verifique a instalação: `java -version`

- **Android Studio** (recomendado) ou Android SDK Command-line tools
  - Baixe em: https://developer.android.com/studio
  - Android Studio já inclui o Android SDK, ferramentas de build e emulador

- **Git** (para clonar o repositório)
  - Baixe em: https://git-scm.com/downloads

### Requisitos do Sistema

- **Minimum SDK**: API 21 (Android 5.0)
- **Target SDK**: API 34 (Android 14)
- **Gradle**: 8.0
- **Android Gradle Plugin**: 8.1.0

## Como Instalar

### Passo 1: Clonar o Repositório

```bash
git clone https://github.com/jodavila/legendary-adventure.git
cd legendary-adventure
```

### Passo 2: Abrir no Android Studio

1. Abra o Android Studio
2. Clique em **File** → **Open**
3. Navegue até a pasta `legendary-adventure` e selecione-a
4. Clique em **OK**
5. Aguarde o Android Studio indexar o projeto e sincronizar as dependências do Gradle

### Passo 3: Sincronizar Dependências

Após abrir o projeto, o Android Studio automaticamente iniciará a sincronização do Gradle. Se não acontecer:

1. Clique em **File** → **Sync Project with Gradle Files**
2. Ou clique no ícone do elefante (Gradle) na barra de ferramentas

## Como Gerar/Compilar a Aplicação

### Usando Android Studio (Recomendado)

#### Opção 1: Executar em um Emulador

1. Configure um emulador Android:
   - Clique em **Tools** → **Device Manager**
   - Clique em **Create Device**
   - Selecione um dispositivo (ex: Pixel 4)
   - Selecione uma imagem do sistema (recomendado: API 34 ou superior)
   - Clique em **Finish**

2. Execute o aplicativo:
   - Selecione o emulador na lista de dispositivos
   - Clique no botão **Run** (▶️) ou pressione `Shift + F10`
   - O app será compilado e instalado no emulador

#### Opção 2: Executar em um Dispositivo Físico

1. Habilite o modo desenvolvedor no seu dispositivo Android:
   - Vá em **Configurações** → **Sobre o telefone**
   - Toque 7 vezes em **Número da versão**
   - Volte e entre em **Opções do desenvolvedor**
   - Ative **Depuração USB**

2. Conecte o dispositivo ao computador via USB

3. Execute o aplicativo:
   - Selecione seu dispositivo na lista
   - Clique no botão **Run** (▶️)

#### Opção 3: Gerar APK

Para gerar um arquivo APK que pode ser instalado em qualquer dispositivo:

1. Clique em **Build** → **Build Bundle(s) / APK(s)** → **Build APK(s)**
2. Aguarde a compilação
3. Quando terminar, clique em **locate** na notificação
4. O APK estará em: `app/build/outputs/apk/debug/app-debug.apk`

#### Opção 4: Gerar APK Assinado (Release)

Para gerar um APK de produção:

1. Clique em **Build** → **Generate Signed Bundle / APK**
2. Selecione **APK**
3. Crie ou selecione uma keystore
4. Preencha as informações da keystore
5. Selecione **release** como build type
6. Clique em **Finish**

### Usando Linha de Comando

#### No Linux/macOS:

```bash
# Navegar até a pasta do projeto
cd legendary-adventure

# Dar permissão de execução ao gradlew
chmod +x gradlew

# Compilar o projeto
./gradlew assembleDebug

# O APK será gerado em: app/build/outputs/apk/debug/app-debug.apk
```

#### No Windows:

```cmd
# Navegar até a pasta do projeto
cd legendary-adventure

# Compilar o projeto
gradlew.bat assembleDebug

# O APK será gerado em: app\build\outputs\apk\debug\app-debug.apk
```

#### Outros Comandos Úteis:

```bash
# Limpar build anterior
./gradlew clean

# Compilar versão release
./gradlew assembleRelease

# Executar testes
./gradlew test

# Instalar diretamente em dispositivo conectado
./gradlew installDebug
```

## Instalando o APK em um Dispositivo

Após gerar o APK:

1. Transfira o arquivo `app-debug.apk` para seu dispositivo Android
2. No dispositivo, vá em **Configurações** → **Segurança**
3. Ative **Fontes desconhecidas** ou **Instalar apps desconhecidos**
4. Use um gerenciador de arquivos para localizar o APK
5. Toque no arquivo APK para instalar
6. Toque em **Instalar** e aguarde a instalação

### Tecnologias Usadas

- **Kotlin**: Linguagem de programação principal
- **Android SDK**: Plataforma Android (API 21+)
- **Material Design Components**: Para componentes de UI modernos
- **ConstraintLayout**: Para layouts flexíveis e responsivos
