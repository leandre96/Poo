

public aspect Notificaciones{
	pointcut notif(): call(* SidWebBeta.*(..));
	after(): notif(){
		System.out.println("Notificacion Enviada al correo de los usuarios");
	}
}