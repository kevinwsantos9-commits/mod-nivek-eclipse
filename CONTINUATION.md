# CONTINUATION — manual para outra IA

## Objetivo do mod
NIVEK: ECLIPSE (Fabric 1.21.8). Um meteoro cai perto do jogador. Ele toca o núcleo extraterrestre e se funde com ele (tentáculos, mutação nível 1). Depois evolui em 5 estágios com o ECLIPSE SYSTEM (interface), braço biomecânico, lâmina/garras, implantes, criaturas e chefes, e transformações finais (tentáculos, asas, Armadura Eclipse).

## História
Meteoro -> cratera -> núcleo alienígena (evento único por jogador) -> fusão cinematográfica -> mutação nível 1 -> evolução.

## Arquitetura
- `src/main`: lógica comum (servidor + cliente). Entrypoint `NivekEclipse`.
- `src/client`: render, GUI, modelos, input. Entrypoint `client.NivekEclipseClient`.
- Mod id `nivekeclipse`. Pacote `com.nivek.eclipse`.

## Estrutura atual
```
build.gradle, settings.gradle, gradle.properties
.github/workflows/build.yml
src/main/java/com/nivek/eclipse/NivekEclipse.java
src/client/java/com/nivek/eclipse/client/NivekEclipseClient.java
src/main/resources/fabric.mod.json
src/main/resources/assets/nivekeclipse/lang/en_us.json
```

## Sistemas implementados
Somente a fundação (Fase 01).

## APIs e dependências
Fabric Loader 0.19.5, Fabric API 0.136.1+1.21.8, Loom 1.11-SNAPSHOT, mappings oficiais Mojang, Java 21.

## Convenções
- Mappings da Mojang: nomes de classes vêm deles (ex.: `ResourceLocation`, `ServerPlayer`), não Yarn.
- Uma classe de registro por tipo (itens, blocos, entidades...), sem duplicar registradores.
- Constantes em `NivekEclipse` (`MOD_ID`, `LOGGER`).
- Não chutar APIs: conferir na versão 1.21.8.

## Problemas e soluções
- O wrapper do Gradle não está no projeto; o CI instala o Gradle 8.14.3 direto. Localmente use Gradle 8.14+ instalado.

## Última fase concluída
Nenhuma verificada.

## Próxima tarefa exata
1. Rodar o build (GitHub Actions) e corrigir erros da Fase 01.
2. Atualizar `DEVELOPMENT_STATUS.md` com o resultado real.
3. Só então iniciar a Fase 02 (evento do meteoro).

## Como continuar
Ler README, DEVELOPMENT_STATUS e CONTINUATION; não recriar o projeto, não apagar sistemas existentes, não alterar versões sem necessidade.
