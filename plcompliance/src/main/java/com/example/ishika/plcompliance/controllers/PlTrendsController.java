package com.example.ishika.plcompliance.controllers;

@RestController
@RequestMapping("/api/pnl-trends")
public class PnlTrendsController {

    private final PnlTrendsService pnlTrendsService;

    public PnlTrendsController(PnlTrendsService pnlTrendsService) {
        this.pnlTrendsService = pnlTrendsService;
    }

    // Endpoint to get P&L trends for a specific user role
    @GetMapping
    public ResponseEntity<PnlTrendsDto> getPnlTrends(
            @RequestParam String userRole,
            @RequestParam(required = false) String timePeriod) {
        PnlTrendsDto pnlTrends = pnlTrendsService.getPnlTrends(userRole, timePeriod);
        return ResponseEntity.ok(pnlTrends);
    }
}

