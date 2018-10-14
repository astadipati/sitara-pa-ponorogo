package net.ramastudio.sitaraponorogo.model;

import com.google.gson.annotations.SerializedName;

public class Session {
    public String nama;
    public String email;
    @SerializedName("IDPerkara")
    public int idperkara;
}
