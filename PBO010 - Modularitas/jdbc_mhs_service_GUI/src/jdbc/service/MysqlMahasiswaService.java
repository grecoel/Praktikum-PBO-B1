package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    private Connection conn;

    public MysqlMahasiswaService() throws SQLException {
        this.conn = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        return new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
    }

    public void add(Mahasiswa mhs) throws SQLException {
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
        }
    }

    public void update(Mahasiswa mhs) throws SQLException {
        String query = "UPDATE mahasiswa SET nama=? WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
        }
    }

    // Tambahkan method ini di bawah method update(Mahasiswa mhs)
    public void update(int id, String nama) throws SQLException {
        update(new Mahasiswa(id, nama));
    }

    public void delete(int id) throws SQLException {
        String query = "DELETE FROM mahasiswa WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    public Mahasiswa getById(int id) throws SQLException {
        String query = "SELECT * FROM mahasiswa WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return makeMhsObject(rs);
            }
        }
        return null;
    }

    public List<Mahasiswa> getAll() throws SQLException {
        List<Mahasiswa> list = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa ORDER BY id";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                list.add(makeMhsObject(rs));
            }
        }
        return list;
    }

    public void indexReset() throws SQLException {
        String truncateQuery = "TRUNCATE TABLE mahasiswa";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(truncateQuery);
        }
    }

    public boolean isEmpty() throws SQLException {
        String query = "SELECT COUNT(*) FROM mahasiswa";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        }
        return true;
    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Tambahkan method ini agar insert dari nama saja (tanpa id)
    public void insert(String nama) throws SQLException {
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, nama);
            ps.executeUpdate();
        }
    }
}
