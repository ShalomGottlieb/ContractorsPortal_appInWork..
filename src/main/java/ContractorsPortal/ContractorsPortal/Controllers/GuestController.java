package ContractorsPortal.ContractorsPortal.Controllers;

import ContractorsPortal.ContractorsPortal.Beans.Message;
import ContractorsPortal.ContractorsPortal.Beans.Training;
import ContractorsPortal.ContractorsPortal.Beans.User;
import ContractorsPortal.ContractorsPortal.Exceptions.AlreadyExistsException;
import ContractorsPortal.ContractorsPortal.Exceptions.NotFoundException;
import ContractorsPortal.ContractorsPortal.Services.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("guest")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class GuestController {
    private final GuestService guestService;

    @PostMapping("getAllTraining")
    public ResponseEntity<?> getAllTraining() throws Exception {
        try {
            return ResponseEntity.ok()
                    .body(guestService.getAllTraining());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @PostMapping("getAllMessages")   //todo giving twice
    public ResponseEntity<?> getAllMessages() throws Exception {
        try {
            return ResponseEntity.ok()
                    .body(guestService.getAllMessages());
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @PostMapping("addTraining")
    public ResponseEntity<?> addTraining(@RequestBody Training training) throws Exception {
        try {
            guestService.addTraining(training);
            return ResponseEntity.accepted()
                    .body("successfully added");
        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }
    }

    @PostMapping("addMessage")
    public ResponseEntity<?> addMessage(@RequestBody Message message) throws Exception {
        try {
            guestService.addMessage(message);
            return ResponseEntity.accepted()
                    .body("successfully added");
        } catch (Exception e) {
            throw new Exception(e.getMessage());

        }
    }

    @PostMapping("registerUser")
    public ResponseEntity<?> registerUser(@RequestBody User user) throws Exception {
        try {
            guestService.registerUser(user);
            return ResponseEntity.accepted()
                    .body("successfully added");
        } catch (AlreadyExistsException e) {
            throw new AlreadyExistsException(e.getMessage());
        } catch (Exception e) {
            throw new Exception(e.getMessage());


        }


    }}

