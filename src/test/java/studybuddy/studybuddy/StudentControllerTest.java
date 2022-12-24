package studybuddy.studybuddy;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetAllStudent() throws Exception {
        mvc.perform(get("/api/student").header(HttpHeaders.AUTHORIZATION, "Bearer "
                + "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IktlUW5WaEdXckthS0g0bjFmSE9mTCJ9.eyJ1c2VyX3JvbGVzIjpbImFkbWluIl0sIm5pY2tuYW1lIjoic3RhbmtkYXYiLCJuYW1lIjoic3RhbmtkYXZAc3R1ZGVudHMuemhhdy5jaCIsInBpY3R1cmUiOiJodHRwczovL3MuZ3JhdmF0YXIuY29tL2F2YXRhci8yOTllMWM4M2RjZDA2ZTkyZjJlYTgwNjA0NTA4MjdhNj9zPTQ4MCZyPXBnJmQ9aHR0cHMlM0ElMkYlMkZjZG4uYXV0aDAuY29tJTJGYXZhdGFycyUyRnN0LnBuZyIsInVwZGF0ZWRfYXQiOiIyMDIyLTEyLTE5VDIyOjU4OjIzLjI4M1oiLCJlbWFpbCI6InN0YW5rZGF2QHN0dWRlbnRzLnpoYXcuY2giLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6Ly9kZXYtenZ5bmFlOHF3cjUwZThrNi51cy5hdXRoMC5jb20vIiwic3ViIjoiYXV0aDB8NjM5MzJhZWNhMmM4YjRmNmQ4YmU4ZGRmIiwiYXVkIjoiSkdjYngzZTFoeXpFM0I2aGpJb0ZJeFU5VjN2YXI0YnciLCJpYXQiOjE2NzE1NjY4MjgsImV4cCI6MTY3MTYwMjgyOCwic2lkIjoic0VrU3Z1NVN0SmdraFk3bjdFdWt2M1JCVXdDMGdQVFUiLCJub25jZSI6IlVsUXlObkJFYjFSc2FVSlZia0Z0VmtKelUyaGtSRmRUWW5KWGNIVXRRVmhPUzBoK1JFVkRWV3B4VlE9PSJ9.oQaVG7vo1Q2enBKYulmI0zz-MJkm148eMA0gWUPfJcfqfOSXgZXOCrLoSrn2p-M5bq5gUfSzeutTUH-nvLBx4PHcQzLE8zxt-hqwlDpy6N8qLSSQDCze8l_50rpXxK_Yq10dbIQYiFvwJ7l8R8q4IX4yfAfowguwK0D7ij_PKokNgCZwliYcwRfVV5Wm8P17EuEtQlbnitDma-reDJfqktmRHzRklwy7mgD3d4jCCKBaY_uodrIfL_LAvA1WtQvZBZ2lZDMwZdZ5TlksI7VNM9aEFuIxQuVlFPfFoJ9NdGLGOU0S-HGbN3A2c3DGyUeF_CwaqrvZqrODYKHXG1bfTQ"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].email", is("uzdilmus@students.zhaw.ch")));
    }

    @Test
    public void testGetStudentById() throws Exception {
        mvc.perform(get("/api/student/639f0c7fe8504f5dc2b0d694").header(HttpHeaders.AUTHORIZATION, "Bearer "
                + "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6IktlUW5WaEdXckthS0g0bjFmSE9mTCJ9.eyJ1c2VyX3JvbGVzIjpbImFkbWluIl0sIm5pY2tuYW1lIjoic3RhbmtkYXYiLCJuYW1lIjoic3RhbmtkYXZAc3R1ZGVudHMuemhhdy5jaCIsInBpY3R1cmUiOiJodHRwczovL3MuZ3JhdmF0YXIuY29tL2F2YXRhci8yOTllMWM4M2RjZDA2ZTkyZjJlYTgwNjA0NTA4MjdhNj9zPTQ4MCZyPXBnJmQ9aHR0cHMlM0ElMkYlMkZjZG4uYXV0aDAuY29tJTJGYXZhdGFycyUyRnN0LnBuZyIsInVwZGF0ZWRfYXQiOiIyMDIyLTEyLTE5VDIyOjU4OjIzLjI4M1oiLCJlbWFpbCI6InN0YW5rZGF2QHN0dWRlbnRzLnpoYXcuY2giLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiaXNzIjoiaHR0cHM6Ly9kZXYtenZ5bmFlOHF3cjUwZThrNi51cy5hdXRoMC5jb20vIiwic3ViIjoiYXV0aDB8NjM5MzJhZWNhMmM4YjRmNmQ4YmU4ZGRmIiwiYXVkIjoiSkdjYngzZTFoeXpFM0I2aGpJb0ZJeFU5VjN2YXI0YnciLCJpYXQiOjE2NzE1NjY4MjgsImV4cCI6MTY3MTYwMjgyOCwic2lkIjoic0VrU3Z1NVN0SmdraFk3bjdFdWt2M1JCVXdDMGdQVFUiLCJub25jZSI6IlVsUXlObkJFYjFSc2FVSlZia0Z0VmtKelUyaGtSRmRUWW5KWGNIVXRRVmhPUzBoK1JFVkRWV3B4VlE9PSJ9.oQaVG7vo1Q2enBKYulmI0zz-MJkm148eMA0gWUPfJcfqfOSXgZXOCrLoSrn2p-M5bq5gUfSzeutTUH-nvLBx4PHcQzLE8zxt-hqwlDpy6N8qLSSQDCze8l_50rpXxK_Yq10dbIQYiFvwJ7l8R8q4IX4yfAfowguwK0D7ij_PKokNgCZwliYcwRfVV5Wm8P17EuEtQlbnitDma-reDJfqktmRHzRklwy7mgD3d4jCCKBaY_uodrIfL_LAvA1WtQvZBZ2lZDMwZdZ5TlksI7VNM9aEFuIxQuVlFPfFoJ9NdGLGOU0S-HGbN3A2c3DGyUeF_CwaqrvZqrODYKHXG1bfTQ"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.email", is("uzdilmus@students.zhaw.ch")));
    }

}