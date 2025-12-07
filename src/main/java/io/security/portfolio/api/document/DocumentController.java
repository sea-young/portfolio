package io.security.portfolio.api.document;

import io.security.portfolio.common.dto.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/documents")
@RequiredArgsConstructor
public class DocumentController {

    // TODO: DocumentService 구현 후 주입 필요
    // private final DocumentService documentService;

    @GetMapping("/{documentId}")
    public ApiResponse<DocumentResponse> getDocument(@PathVariable Long documentId) {
        // 내부 로직:
        // 1. 현재 로그인 유저 정보 획득
        // 2. PolicyEngine을 통해 'document:read' 권한 체크
        // 3. 통과 시 문서 조회 및 반환

        // Document doc = documentService.getDocument(documentId);
        // return ApiResponse.success(DocumentResponse.from(doc));
        return ApiResponse.success(null); // 임시
    }

    @PostMapping
    public ApiResponse<DocumentResponse> createDocument(@RequestBody DocumentRequest request) {
        // 내부 로직: 'document:create' 권한 체크 등
        // Document doc = documentService.createDocument(request);
        // return ApiResponse.success(DocumentResponse.from(doc));
        return ApiResponse.success(null);
    }
}