package com.example.SpingBoot.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Tạo ra class này chỉ để lưu giữ thông tin
 */
@Data
@AllArgsConstructor
public class Info {
    String key;
    String value;
}