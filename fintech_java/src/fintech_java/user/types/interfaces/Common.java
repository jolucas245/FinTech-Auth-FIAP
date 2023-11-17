package fintech_java.user.types.interfaces;

import fintech_java.user.invite.Invite;
import fintech_java.user.types.CommonUser;

public interface Common {
	void signUp(CommonUser commonUser, Invite invite);
}
