# CapyTournament
Herramienta para jugadores amateur de MOBA que quieren organizar y participar en sus propios torneos.
Completada con estadísticas sobre partidos, jugadores y campeones.

## Parte pública ##
Serán visibles los modos de torneo, los equipos, las inscripciones, los torneos y las estadísticas de jugadores, campeons y equipos.

## Parte privada ##
Gestion de cuentas de usuario, pudiendo registrarse como administrador y como jugador, permisos para crear y participar en torneos, y configuracion del perfil del usuario y del equipo. Un usuario de clase admin puede ser tambine jugador, y debe haber un capitan por equipo. Admins y capitanes tendran acceso a mas estadisticas y opciones que los jugadores.

## Entidades ##
- Torneo: almacena los diferentes partidos y equipos, así como el formato del torneo.
- Partido: almacena el juego, los campeones jugados, las estadísticas y los resultados del encuentro.
- Equipo: almacena los jugadores y las estadísticas propias del equipo.
- Jugador: pertenece a un equipo y tiene sus propias estadísticas personales. Puede ser capitán (uno por equipo).
- Campeón: puede ser jugado por varios jugadores (máximo una vez por partido) y también tiene sus propias estadísticas.

## Funcionalidades del servicio interno ##
El servicio interno almacena todas las entidades de la base de datos así como los datos en bruto que luego pueden ser procesados para obtener estadísticas. También gestiona el control de usuarios.
