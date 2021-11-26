//package kg.erkin.FunTime.service.impl;
//
//import kg.erkin.FunTime.dto.entity.Image;
//import kg.erkin.FunTime.dto.mapper.ImageMapper;
//import kg.erkin.FunTime.dto.model.ImageDto;
//import kg.erkin.FunTime.repository.BaseRepository;
//import kg.erkin.FunTime.service.ImageService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class ImageServiceImpl implements ImageService{
//    @Autowired
//    BaseRepository<Image> baseRepository;
//    @Autowired
//    ImageMapper imageMapper;
//
//    @Override
//    public ImageDto getById(Long id) {
//        Image image = baseRepository.findById(id).get();
//        return imageMapper.entityToDto(image);
//    }
//
//    @Override
//    public ImageDto save(ImageDto item) {
//        Image image = baseRepository.save(imageMapper.dtoToEntity(item));
//        return imageMapper.entityToDto(image);
//    }
//
//    @Override
//    public List<ImageDto> getAll() {
//        List<Image> images = baseRepository.findAll();
//        return images.stream().map(x -> imageMapper.entityToDto(x)).collect(Collectors.toList());
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        baseRepository.deleteById(id);
//    }
//}
