package polinema.ac.id.dtschapter04.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Register implements Parcelable {
    private String name, dob, gender, username, password;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.dob);
        dest.writeString(this.gender);
        dest.writeString(this.username);
        dest.writeString(this.password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Creator<Register> getCREATOR() {
        return CREATOR;
    }

    public Register(String name, String dob, String gender, String username, String password) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.username = username;
        this.password = password;
    }

    protected Register(Parcel in) {
        this.name = in.readString();
        this.dob = in.readString();
        this.gender = in.readString();
        this.username = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<Register> CREATOR = new Parcelable.Creator<Register>() {
        @Override
        public Register createFromParcel(Parcel source) {
            return new Register(source);
        }

        @Override
        public Register[] newArray(int size) {
            return new Register[size];
        }
    };
}
