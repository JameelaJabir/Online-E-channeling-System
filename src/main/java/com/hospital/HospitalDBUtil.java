package com.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HospitalDBUtil {

    // Insert hospital
    public static boolean insertHospitals(String hName, String hAddress, String hContactNumber,
                                          String hEmail, String hLicenseNumber, String hWorkinghours) {
        String sql = "INSERT INTO hospital VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = DBConnect.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, hName);
            pstmt.setString(2, hAddress);
            pstmt.setString(3, hContactNumber);
            pstmt.setString(4, hEmail);
            pstmt.setString(5, hLicenseNumber);
            pstmt.setString(6, hWorkinghours);
            return pstmt.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Search hospital by license number
    public static List<Hospital> validate(String licenseNumber) {
        List<Hospital> hospitals = new ArrayList<>();
        String sql = "SELECT * FROM hospital WHERE hLicenseNumber = ?";
        try (Connection con = DBConnect.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, licenseNumber);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    hospitals.add(mapRow(rs));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hospitals;
    }

    // Update hospital
    public static boolean updateHospitals(String name, String address, String phone,
                                          String email, String lno, String whour) {
        String sql = "UPDATE hospital SET hName=?, hAddress=?, hContactNumber=?, hEmail=?, hWorkinghours=? WHERE hLicenseNumber=?";
        try (Connection con = DBConnect.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, phone);
            pstmt.setString(4, email);
            pstmt.setString(5, whour);
            pstmt.setString(6, lno);
            return pstmt.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Retrieve hospital details by license number
    public static List<Hospital> getHospitalDetails(String licenseNumber) {
        List<Hospital> hospitals = new ArrayList<>();
        String sql = "SELECT * FROM hospital WHERE hLicenseNumber = ?";
        try (Connection con = DBConnect.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, licenseNumber);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    hospitals.add(mapRow(rs));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hospitals;
    }

    // Delete hospital by license number
    public static boolean deleteHospital(String licenseNumber) {
        String sql = "DELETE FROM hospital WHERE hLicenseNumber = ?";
        try (Connection con = DBConnect.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, licenseNumber);
            return pstmt.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Retrieve all hospitals
    public static List<Hospital> getAllHospitals() {
        List<Hospital> hospitals = new ArrayList<>();
        String sql = "SELECT * FROM hospital";
        try (Connection con = DBConnect.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                hospitals.add(mapRow(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hospitals;
    }

    private static Hospital mapRow(ResultSet rs) throws Exception {
        return new Hospital(
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5),
            rs.getString(6)
        );
    }
}
